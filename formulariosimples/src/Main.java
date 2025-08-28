import javax.swing.*;

public class FormularioSimples {
    public static void main(String[] args) {
        // Criar a janela
        JFrame frame = new JFrame("Formulário");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout manual

        // Rótulo e campo para Nome
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(120, 20, 180, 25);

        // Rótulo e campo para Idade
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(20, 60, 100, 25);
        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(120, 60, 180, 25);

        // Botão
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(120, 100, 100, 30);

        // Área de mensagem
        JLabel lblResultado = new JLabel("");
        lblResultado.setBounds(20, 150, 300, 25);

        // Ação do botão
        btnEnviar.addActionListener(e -> {
            String nome = txtNome.getText();
            String idade = txtIdade.getText();
            lblResultado.setText("Olá, " + nome + "! Você tem " + idade + " anos.");
        });

        // Adiciona os elementos à janela
        frame.add(lblNome);
        frame.add(txtNome);
        frame.add(lblIdade);
        frame.add(txtIdade);
        frame.add(btnEnviar);
        frame.add(lblResultado);

        // Exibe a janela
        frame.setVisible(true);
    }
}
