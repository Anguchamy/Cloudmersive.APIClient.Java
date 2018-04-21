/*
 * nlpapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.GetWordsJsonResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WordsApi
 */
@Ignore
public class WordsApiTest {

    private final WordsApi api = new WordsApi();

    
    /**
     * Get adjectives in string
     *
     * Retrieves all adjectives in input string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsAdjectivesTest() throws ApiException {
        String input = null;
        String response = api.wordsAdjectives(input);

        // TODO: test validations
    }
    
    /**
     * Get adverbs in input string
     *
     * Returns all adverb words in the input string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsAdverbsTest() throws ApiException {
        String input = null;
        String response = api.wordsAdverbs(input);

        // TODO: test validations
    }
    
    /**
     * Get words in input string (JSON)
     *
     * Get the component words in an input string, formatted as JSON
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsGetWordsJsonTest() throws ApiException {
        String input = null;
        GetWordsJsonResponse response = api.wordsGetWordsJson(input);

        // TODO: test validations
    }
    
    /**
     * Get words from string
     *
     * Segment an input string into its component words
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsGetWordsStringTest() throws ApiException {
        String input = null;
        String response = api.wordsGetWordsString(input);

        // TODO: test validations
    }
    
    /**
     * Get nouns in string
     *
     * Returns all of the nouns in the input string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsNounsTest() throws ApiException {
        String input = null;
        String response = api.wordsNouns(input);

        // TODO: test validations
    }
    
    /**
     * Get the verbs in a string
     *
     * Get all of the verbs in the input string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsPostTest() throws ApiException {
        String input = null;
        String response = api.wordsPost(input);

        // TODO: test validations
    }
    
    /**
     * Returns all pronounts in string
     *
     * Returns all pronouns in the input string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsPronounsTest() throws ApiException {
        String input = null;
        String response = api.wordsPronouns(input);

        // TODO: test validations
    }
    
    /**
     * Get proper nouns in a string
     *
     * Returns all of the proper nouns in a string.  Proper nouns are named entities such as \&quot;Hilton\&quot;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void wordsProperNounsTest() throws ApiException {
        String input = null;
        String response = api.wordsProperNouns(input);

        // TODO: test validations
    }
    
}
