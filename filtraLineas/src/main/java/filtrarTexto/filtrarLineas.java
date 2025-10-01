package filtrarTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class filtrarLineas {
    static void main(String[] args) {

        try{
        InputStreamReader isr = new InputStreamReader(System.in); //Se declara la entrada estándar
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        String linea = null;
        while ((linea = br.readLine()) != null){
            linea = Arrays.toString(linea.split("\\s+|\n")); //Tomar en cuenta espacios, signos de puntuación o saltos de línea
            if (linea.length() >= 20){
                bw.write(linea);
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
