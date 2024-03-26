package HappyJava.src;

public enum Gender {
    MALE("XY"),
    FEMALE("XX");

    private String chromosome;
    private Gender(String chromosome){
        this.chromosome = chromosome;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "chromosome='" + chromosome + '\'' +
                '}';
    }

    public String getChromosome() {
        return chromosome;
    }
}
