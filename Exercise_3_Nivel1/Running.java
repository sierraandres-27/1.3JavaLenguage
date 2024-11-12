package Exercise_3_Nivel1;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;




public class Running {

    public static void start() {


        HashMap<String,String>paises_capitales=new HashMap<String,String>();

        leer_archivo(paises_capitales);

        ArrayList <String> keys = new ArrayList<>(paises_capitales.keySet());

        int score=0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Typed your name: ");

        String name_user =entrada.nextLine();

        for (int i=0 ;i<10;i++){

            Random aleatorio_number = new Random();

            String aleatoriokey = keys.get(aleatorio_number.nextInt(keys.size()));

            System.out.println("Hola "+name_user+", could you tell de capital of: "+aleatoriokey);

            String value_country= entrada.nextLine();

            if(paises_capitales.containsKey(aleatoriokey) && paises_capitales.get(aleatoriokey).equals(value_country)){

                System.out.println("La capital es la correcta");

                score++;


            }else {

                System.out.println("La capital no es la correcta");

            }


        }

        System.out.println("Your score is printed in the file");

        guardar_informacion(name_user,score);



    }

    private  static  void guardar_informacion (String name_user_p, int score_p ){

        String score_string =Integer.toString(score_p);

        try {

            BufferedWriter writer =new BufferedWriter(new FileWriter ("src/Exercise_3_Nivel1/name_score.txt"));

            writer.write(name_user_p+", su puntuación es: "+score_string);
            writer.newLine();

            writer.close();

        }

        catch (IOException e){

            System.out.println("Error al escribir en el archivo");
        }

    }

    private static void leer_archivo (HashMap<String,String>paises_capitales_p){

        try{

            BufferedReader lector=new BufferedReader(new FileReader("src/Exercise_3_Nivel1/countries.txt"));

            String linea="";

            while ((linea=lector.readLine())!=null){


                String [] blocks=linea.split("\t");
                if(blocks.length==2){

                    String pais=blocks[0];

                    String capital=blocks[1];

                    paises_capitales_p.put(pais,capital);

                }

            }

        }catch (IOException e){

            System.out.println("Error al leer el archivo"+e.getMessage());
        }
    }

}

