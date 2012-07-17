package com.devbliss.doctest.machine;

import java.net.URI;

import org.json.JSONException;

import com.devbliss.doctest.items.AssertDocItem;
import com.devbliss.doctest.items.JsonDocItem;
import com.devbliss.doctest.items.RequestDocItem;
import com.devbliss.doctest.items.ResponseDocItem;
import com.devbliss.doctest.items.SectionDocItem;
import com.devbliss.doctest.items.TextDocItem;

import de.devbliss.apitester.ApiTest.HTTP_REQUEST;

/**
 * The {@link DocTestMachine} offers method to generate a report. <code>
 * <ol>
 * <li>First of all, the {@link #beginDoctest(String)} method must be called to initialize the report.</li>
 * <li>Then, the different say methods give the possibility to write some informations into the report
 * by using several templates (Request, response, assert)</li>
 * <li>The method {@link #endDocTest()} ends up the generation of the file.</li>
 * </ol>
 * </code>
 * 
 * @author bmary
 * 
 */
public interface DocTestMachine {

    public static final String NOT_VALID_JSON = "The payload is not a valid json: ";

    /**
     * Begins a report if there is no on-going generation.
     * 
     * @param className The name of the tested class, which is going to be the name of the file.
     */
    void beginDoctest(String className);

    /**
     * Ends up the generation of the report.
     * 
     * @throws Exception
     */
    void endDocTest() throws Exception;

    /**
     * Writes a new {@link TextDocItem} into the report.
     * 
     * @param say Text to add
     */
    void say(String say);

    /**
     * Writes a new {@link SectionDocItem} into the report.
     * 
     * @param sectionTitle Title of the new section
     */
    void sayNextSectionTitle(String sectionTitle);

    /**
     * Writes a new {@link RequestDocItem} into the report.
     * 
     * @param uri
     * @param payload
     * @param httpRequest
     * @throws JSONException
     */
    void sayRequest(URI uri, String payload, HTTP_REQUEST httpRequest) throws JSONException;

    /**
     * Writes a new {@link ResponseDocItem} into the report.
     * 
     * @param responseCode
     * @param payload
     * @throws Exception
     */
    void sayResponse(int responseCode, String payload) throws Exception;

    /**
     * Writes a new {@link AssertDocItem} into the report.
     * 
     * @param condition
     */
    void sayVerify(String condition);

    /**
     * Writes a new {@link JsonDocItem} into the report.
     * 
     * @param preformattedText
     */
    void sayPreformatted(String preformattedText);
}
