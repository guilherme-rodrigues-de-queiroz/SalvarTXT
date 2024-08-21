import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            // salvar uma informação em um arquivo de texto
            File arquivo = new File("C:\\Users\\Guilherme\\Desktop\\teste.txt"); // coloque seu diretório
            String nome = "Guilherme";

            OutputStream out = new FileOutputStream(arquivo);
            out.write(nome.getBytes());
            out.close();

            // Obter o dado salvo dentro do arquivo
            FileInputStream in = new FileInputStream(arquivo);
            int tamanho = in.available();
            byte bytes[] = new byte[tamanho];
            in.read(bytes);
            String nomearmazenado = new String(bytes);
            System.out.println("O nome que está salvo no arquivo é: " + nomearmazenado);
            in.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
