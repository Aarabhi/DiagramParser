package com.tutor.service.RestService;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Wiranji Dinelka on 8/6/2017.
 */
public interface SVGAnswerService {
    public void storeSVGInput(String inputStr) throws IOException, ParserConfigurationException, SAXException, TransformerException;
}
