import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main só criando os objetos!");
        Especialidade especialidade = new Especialidade();
        Consulta consulta = new Consulta();
        Farmacia farmacia = new Farmacia();
        FilaAtendimento filaAtendimento = new FilaAtendimento();
        Medicamento medicamento = new Medicamento();
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
        Prontuario prontuario = new Prontuario();
        SistemaTriagem sistemaTriagem = new SistemaTriagem();
    }
}