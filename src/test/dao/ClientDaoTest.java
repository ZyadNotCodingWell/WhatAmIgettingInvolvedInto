package test.dao;

import main.metier.Client;
import main.dao.ClientDao;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ClientDaoTest {
    @Test
    public void testCreateClient() {
        ClientDao clientDao = new ClientDao();
        ArrayList<Client> clients = clientDao.createClient();
        assertNotNull(clients);
        assertTrue(clients.size() > 0);
    }

    @Test
    public void testGetClientParMC() {
        ClientDao clientDao = new ClientDao();
        ArrayList<Client> clients = clientDao.createClient();
        Client client = clientDao.getClientParMC("DUBOIS", clients);
        assertNotNull(client);
        assertEquals("DUBOIS", client.getNom());
    }

    @Test
    public void testDeleteClientParMC() {
        ClientDao clientDao = new ClientDao();
        ArrayList<Client> clients = clientDao.createClient();
        int initialSize = clients.size();
        ArrayList<Client> remainingClients = clientDao.deleteClientParMC("DUBOIS", clients);
        assertTrue(remainingClients.size() < initialSize);
        assertTrue(remainingClients.stream().noneMatch(client -> client.getNom().startsWith("DUBOIS")));
    }
}
