package com.transaction.simulator.parser;

import java.io.InputStream;
import java.util.Set;

public class TransactionParser {

    //This method validates a JSON node against a given schema
    public static boolean validateTransaction(JsonNode node, InputStream schemaStream) throws Exception {
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance();
        JsonSchema schema = factory.getSchema(schemaStream);
        Set<ValidationMessage> errors = schema.validate(node);

        if (!errors.isEmpty()) {
            System.out.println("Validation errors:");
            errors.forEach(System.out::println);
            return false;
        }

        return true;
    }

    // TODO 1: Load a JSON file and return it as a JsonNode
    public static JsonNode loadJson(String filePath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // TODO: Create a File object from the given filePath
        // File file = new File(...);

        // TODO: Use mapper.readTree(file) to parse the JSON into a JsonNode
        // JsonNode node = ...

        // TODO: Return the JsonNode
        return null;
    }

    // TODO 2: Convert a JsonNode into a Java object of a specific class (like Transaction.class)
    public static <T> T parseToObject(JsonNode node, Class<T> clazz) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // TODO: Use mapper.treeToValue(node, clazz) to convert JsonNode to a Java object
        // return ...

        return null;
    }
}