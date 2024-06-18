public static Produit createProduitFromString(String produitString) {
        String[] parts = produitString.split(", ");
        String className = parts[0].substring(0, parts[0].indexOf("[")).trim();

        if (className.equals("ProduitA")) {
            Quality quality = Quality.valueOf(parts[1].substring(parts[1].indexOf("=") + 1).trim());
            String name = parts[2].substring(parts[2].indexOf("=") + 1).trim();
            String originCity = parts[3].substring(parts[3].indexOf("=") + 1).trim();
            float unitPrice = Float.parseFloat(parts[4].substring(parts[4].indexOf("=") + 1).trim());
            int quantity = Integer.parseInt(parts[5].substring(parts[5].indexOf("=") + 1).trim());
            return new ProduitA(name, originCity, unitPrice, quantity, quality);
        } else if (className.equals("ProduitB")) {
            float discountRate = Float.parseFloat(parts[1].substring(parts[1].indexOf("=") + 1).trim());
            String name = parts[2].substring(parts[2].indexOf("=") + 1).trim();
            String originCity = parts[3].substring(parts[3].indexOf("=") + 1).trim();
            float unitPrice = Float.parseFloat(parts[4].substring(parts[4].indexOf("=") + 1).trim());
            int quantity = Integer.parseInt(parts[5].substring(parts[5].indexOf("=") + 1).trim());
            return new ProduitB(name, originCity, unitPrice, quantity, discountRate);
        }

        return null;
    }
