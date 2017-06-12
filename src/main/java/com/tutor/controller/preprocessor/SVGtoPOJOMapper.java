package com.tutor.controller.preprocessor;

import com.tutor.model.graphicalPOJOObject.GraphicalImageComponent;
import com.tutor.model.graphicalSVGObject.SVGImage;

import java.util.ArrayList;

/**
 * Created by Madhavi Ruwandika on 6/4/2017.
 */
public class SVGtoPOJOMapper {

    SVGImage svgImage;
    ArrayList<GraphicalImageComponent> graphicalImageComponents ;

    public SVGtoPOJOMapper(SVGImage svgImage) {
        this.svgImage = svgImage;
        this.graphicalImageComponents = new ArrayList<>();
    }

    public SVGImage getSvgImage() {
        return svgImage;
    }

    public void setSvgImage(SVGImage svgImage) {
        this.svgImage = svgImage;
    }

    public ArrayList<GraphicalImageComponent> getGraphicalImageComponents() {
        return graphicalImageComponents;
    }

    public void setGraphicalImageComponents(ArrayList<GraphicalImageComponent> graphicalImageComponents) {
        this.graphicalImageComponents = graphicalImageComponents;
    }

}
