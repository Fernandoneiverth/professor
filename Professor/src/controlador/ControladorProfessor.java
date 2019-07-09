package controlador;
import Dao.ProfessorDao;
import javax.swing.JOptionPane;
import modelo.Professor;
import tela.manutencao.ManutencaoProfessor;



public class ControladorProfessor {

        public static void inserir(ManutencaoProfessor man){
        Professor objeto = new Professor();
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setNome(man.jtfNome.getText());
        objeto.setSobrenome(man.jtfSobrenome.getText());
        
            boolean resultado = ProfessorDao.inserir(objeto);
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro!");
            }
        }
    }
