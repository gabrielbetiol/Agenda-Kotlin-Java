package bussiness

import entity.ContactEntity
import repository.ContactRepository

class ContactBussiness {

    fun validate(name: String, phone: String) {             // Metodo para validar contato
        if (name == "") {
            throw Exception("Nome é obrigatório!");
        }
        if (phone == "") {
            throw  Exception("Telefone é obrigatório!");
        }
    }

    fun validateDelete(name: String, phone: String) {     //Método para deletar contato
        if (name == "" || phone == "") {
            throw Exception("É necessário selecionar um contato antes de remover!");
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)
        val contact =  ContactEntity(name, phone);

        ContactRepository.save(contact);
    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone);
        val contact =  ContactEntity(name, phone);

        ContactRepository.delete(contact);
    }

}