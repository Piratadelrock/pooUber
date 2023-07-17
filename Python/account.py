# upper camel case para clases y lower para atributos
class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document):
        self.name = name
        self.document = document
