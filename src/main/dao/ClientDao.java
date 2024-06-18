package main.dao;
import java.util.ArrayList;

import main.metier.*;



public class ClientDao {
	private ArrayList<Client> clients = new ArrayList<Client>();

	public ArrayList<Client> createClient(){
		return this.clients;
	}
	public Client getClientParMC(String mc, ArrayList<Client> list) {
        for (Client client : list) {
            if (client.getNom().startsWith(mc)) {
                return client;
            }
        }
        return null;
    }
	public ArrayList<Client> deleteClientParMC(String mc, ArrayList<Client> list) {
        ArrayList<Client> result = new ArrayList<>();
        for (Client client : list) {
            if (!client.getNom().startsWith(mc)) {
                result.add(client);
            }
        }
        return result;
    }
}
