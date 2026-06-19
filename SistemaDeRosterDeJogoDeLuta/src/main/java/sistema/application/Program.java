package sistema.application;

import sistema.entities.Atirador;
import sistema.entities.LutadorCorpoACorpo;
import sistema.entities.Personagem;

import javax.swing.table.TableRowSorter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

    static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<>();

        String path = "C:\\tekken\\personagens_db.csv.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] vectL = linha.split(";");
                Integer forcaBase = null;

                try {
                    forcaBase = Integer.parseInt(vectL[2]);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }

                if (linha.charAt(0) == 'L') {
                    personagens.add(new LutadorCorpoACorpo(vectL[1], forcaBase, vectL[3]));

                } else if (linha.charAt(0) == 'A') {
                    personagens.add(new Atirador(vectL[1], forcaBase, vectL[3]));

                }
            }
        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
        for (Personagem jogadores: personagens){
            System.out.println(jogadores);
        }



    }
}

