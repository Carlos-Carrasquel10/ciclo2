package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) throws Exception {
        String Root = "C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Compilador";
     //   String Root = "C:/Users/Dell/Downloads/AnalizadorLexico";
     //   String Root = "C:/Users/JoahnDavidTurgaOrtiz/Documents/NetBeansProjects/Compilador";

        
        String ruta1 = Root+"/src/codigo/Lexer.flex";
        String ruta2 = Root+"/src/codigo/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", Root+"/src/codigo/Sintax.cup"};
        generar(ruta1, Root, ruta2, rutaS);
    }
    public static void generar(String ruta1, String Root, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        Path rutaLex = Paths.get(Root+"/src/codigo/Lexer.java");
        if (Files.exists(rutaLex)) {
            Files.delete(rutaLex);
        }
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        Path rutaLex2 = Paths.get(Root+"/src/codigo/LexerCup.java");
        if (Files.exists(rutaLex2)) {
            Files.delete(rutaLex2);
        }
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get(Root+"/src/codigo/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get(Root+"/sym.java"), 
                Paths.get(Root+"/src/codigo/sym.java")
        );
        Path rutaSin = Paths.get(Root+"/src/codigo/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get(Root+"/Sintax.java"), 
                Paths.get(Root+"/src/codigo/Sintax.java")
        );
        
        
        
    }
}
