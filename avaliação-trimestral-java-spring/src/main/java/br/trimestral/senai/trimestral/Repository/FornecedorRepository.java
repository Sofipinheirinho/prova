package br.trimestral.senai.trimestral.Repository;

import model.Fornecedor;

public interface FornecedorRepository {
    public Fornecedor FindByNome(String nome);
    public Fornecedor FindByEmail(String email);
    public Fornecedor FindByTelefone(String telefone);
}
