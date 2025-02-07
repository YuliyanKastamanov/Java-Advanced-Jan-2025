package L10_Exam_Preparation.lab.geoglyphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static L10_Exam_Preparation.lab.geoglyphs.ConstantMessages.*;

public class Location {

    private String name;
    private Collection<Geoglyph> geoglyphs;

    public Location(String name) {
        this.name = name;
        this.geoglyphs = new ArrayList<>();
    }

    public String addGeoglyph(Geoglyph geoglyph) {
        Geoglyph geoglyph1 = this.geoglyphs.stream()
                                           .filter(g -> g.getName().equals(geoglyph.getName()))
                                           .findFirst()
                                           .orElse(null);

        if (geoglyph1 == null) {
            this.geoglyphs.add(geoglyph);
            return GEOGLYPH_ADDED.formatted(geoglyph.getName(), this.name);
        } else {
            throw new IllegalArgumentException(EXISTING_GEOGLYPH);
        }
    }

    public boolean removeGeoglyph(String name) {
        return this.geoglyphs.removeIf(geoglyph -> geoglyph.getName().equals(name));
    }

    public String getGeoglyphsByConstructionTechnique(String constructionTechnique) {

        List<Geoglyph> geoglyphs = this.geoglyphs.stream()
                                                 .filter(geoglyph -> geoglyph.getConstructionTechnique().equals(constructionTechnique))
                                                 .toList();

        if (geoglyphs.isEmpty()) {
            return NO_GEOGLYPHS_BY_TECHNIQUE.formatted(constructionTechnique);
        } else {
            String geoglyphsNames = geoglyphs.stream()
                                             .map(Geoglyph::getName)
                                             .collect(Collectors.joining(", "));

            return GEOGLYPHS_BY_TECHNIQUE.formatted(constructionTechnique, geoglyphsNames);
        }
    }

    public String getLargestGeoglyph() {
        Geoglyph geoglyph = this.geoglyphs.stream()
                                          .sorted((g1, g2) -> Integer.compare(g2.getSize(), g1.getSize()))
                                          .toList()
                                          .get(0);
        return LARGEST_GEOGLYPH.formatted(geoglyph.getName(), geoglyph.getSize());
    }

    public Geoglyph getGeoglyphByName(String name) {
        return this.geoglyphs.stream()
                             .filter(geoglyph -> geoglyph.getName().equals(name))
                             .findFirst()
                             .orElse(null);
    }

    public int getCount() {
        return this.geoglyphs.size();
    }

    public String getStatistics() {
        if (this.geoglyphs.isEmpty()) {
            return NO_GEOGLYPHS_DISCOVERED.formatted(this.name);
        }

        StringBuilder sb = new StringBuilder();

        sb.append(GEOGLYPHS_IN_LOCATION.formatted(this.name));
        this.geoglyphs.forEach(geoglyph -> {
            sb.append(System.lineSeparator());
            sb.append("* ").append(geoglyph.getName());
        });

        return sb.toString();
    }
}
