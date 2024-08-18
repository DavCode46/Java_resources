package dev.davcode;

enum Geometry {
    POINT, LINE, POLYGON
}

enum Color {
    RED, GREEN, BLUE, BLACK, ORANGE
}

enum PointMarker {
    CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE
}

enum LineMarker {
    DASH, DOTTED, SOLID
}

public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s} """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
               "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
