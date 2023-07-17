class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public Account(String name, String document, String email, String password) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    void printDataAccount() {

        System.out.printf("ID: %s\nName: %s\nDocument: %s\nEmail: %s\nPassword: %s\n", id, name, document, email,
                password);
        // formas de impresion
        // System.out.println("ID: " + id);
        // System.out.println("Name: " + name);
        // System.out.println("Document: " + document);
        // System.out.println("Email: " + email);
        // System.out.println("Password: " + password);
        //

        // System.out.println("ID: " + id +
        // "\nName: " + name +
        // "\nDocument: " + document +
        // "\nEmail: " + email +
        // "\nPassword: " + password);

    }
}