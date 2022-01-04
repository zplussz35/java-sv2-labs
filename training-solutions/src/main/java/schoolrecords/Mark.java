package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;

        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        if (MarkType.A.getMarkName().equals(markType)) {
            this.markType = MarkType.A;
        } else if (MarkType.B.getMarkName().equals(markType)) {
            this.markType = MarkType.B;
        } else if (MarkType.C.getMarkName().equals(markType)) {
            this.markType = MarkType.C;
        } else if (MarkType.D.getMarkName().equals(markType)) {
            this.markType = MarkType.D;
        } else if (MarkType.F.getMarkName().equals(markType)) {
            this.markType = MarkType.F;
        } else {
            throw new IllegalArgumentException("Dont correct mark type name!");
        }
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return markType.getMarkName() + "(" + markType.getMark() + ")";
    }

}
