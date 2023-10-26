package Hoony.poketmonTest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class JsonParsingExample {

    public static void main(String[] args) {
        System.out.println("한글 출력 안되니?? >> ???");

        try{
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/4");
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(url);

            // "abilities" 배열을 순회하며 "ability" 객체의 "name"을 출력합니다.
            JsonNode abilitiesArray = jsonNode.get("abilities");
            for (JsonNode abilityEntry : abilitiesArray) {
                String abilityName = abilityEntry.get("ability").get("name").asText();
                System.out.println("abilityName 출력값 = " + abilityName);
            }


        }catch (IOException e){
            e.printStackTrace();
        }


    }


}
