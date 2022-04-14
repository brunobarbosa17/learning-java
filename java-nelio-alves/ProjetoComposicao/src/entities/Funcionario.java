package entities;

import entities.enums.NivelFuncionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {

  private String nome;
  private NivelFuncionario nivelFuncionario;
  private Double salarioBase;

  private Departamento departamento;
  private List<HoraContrato> contratos = new ArrayList<>();


  public void adicionarContrato(HoraContrato contrato) {
    contratos.add(contrato);
  }

  public void removerContrato(HoraContrato contrato) {
    contratos.remove(contrato);
  }

  public double calcularRenda(int ano, int mes) {
    double soma = salarioBase;
    Calendar cal = Calendar.getInstance();
    for (HoraContrato contrato : contratos) {
      cal.setTime(contrato.getData());
      int ano_contrato = cal.get(Calendar.YEAR);
      int mes_contrato = cal.get(Calendar.MONTH) + 1;
      if (ano_contrato == ano && mes_contrato == mes) {
        soma += contrato.valorTotal();
      }
    }

    return soma;
  }

  // ------------------

  public Funcionario() {}

  public Funcionario(String nome, NivelFuncionario nivelFuncionario, Double salarioBase, Departamento departamento) {
    this.nome = nome;
    this.nivelFuncionario = nivelFuncionario;
    this.salarioBase = salarioBase;
    this.departamento = departamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public NivelFuncionario getNivelFuncionario() {
    return nivelFuncionario;
  }

  public void setNivelFuncionario(NivelFuncionario nivelFuncionario) {
    this.nivelFuncionario = nivelFuncionario;
  }

  public Double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(Double salarioBase) {
    this.salarioBase = salarioBase;
  }

  public Departamento getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

  public List<HoraContrato> getContratos() {
    return contratos;
  }

}
