package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan planSketch = new SketchPlan(100,"SketchPlan");
        Plan planPermit = new PermitPlan(120,"PermitPlan","ClientName","AddressofBuilding");
        Plan planConstruct = new ConstructionPlan(130,"ConstructionPlan","NameOfClient","AddressOfBuilding",10);

        SketchPlan sketchPlan = new SketchPlan(100,"SketchPlan");
        SketchPlan sketchPermit = new PermitPlan(120,"PermitPlan","ClientName","AddressofBuilding");
        SketchPlan sketchConstruct = new ConstructionPlan(130,"ConstructionPlan","NameOfClient","AddressOfBuilding",10);

        Header headerPermit = new PermitPlan(120,"PermitPlan","ClientName","AddressofBuilding");
        Header headerConstruct = new ConstructionPlan(130,"ConstructionPlan","NameOfClient","AddressOfBuilding",10);

        PermitPlan permitPlan = new PermitPlan(120,"PermitPlan","ClientName","AddressofBuilding");
        PermitPlan permitConstruct = new ConstructionPlan(130,"ConstructionPlan","NameOfClient","AddressOfBuilding",10);

        ConstructionPlan constructionPlan = new ConstructionPlan(130,"ConstructionPlan","NameOfClient","AddressOfBuilding",10);

        System.out.println(planSketch.getPagesOfDocumentation());
        System.out.println(planPermit.getPagesOfDocumentation());
        System.out.println(planConstruct.getPagesOfDocumentation());

        System.out.println(sketchPlan.getPagesOfDocumentation()+" "+sketchPlan.getTitle());
        System.out.println(sketchPermit.getPagesOfDocumentation()+" "+sketchPermit.getTitle());
        System.out.println(sketchConstruct.getPagesOfDocumentation()+" "+sketchConstruct.getTitle());

        System.out.println(headerPermit.getNameOfClient()+" "+headerPermit.getAddressOfBuilding());
        System.out.println(headerConstruct.getNameOfClient()+" "+headerConstruct.getAddressOfBuilding());

        System.out.println(permitPlan.getTitle()+" "+permitPlan.getAddressOfBuilding()+" "+permitPlan.getNameOfClient()+" "+permitPlan.getHeader()+" "+permitPlan.getPagesOfDocumentation());
        System.out.println(permitConstruct.getTitle()+" "+permitConstruct.getAddressOfBuilding()+" "+permitConstruct.getNameOfClient()+" "+permitConstruct.getHeader()+" "+permitConstruct.getPagesOfDocumentation());

        System.out.println(constructionPlan.getHeader()+" "+constructionPlan.getTitle()+" "+constructionPlan.getAddressOfBuilding()+" "+constructionPlan.getNameOfClient()+" "+constructionPlan.getSheetsOfConstructionDrawings()+" "+constructionPlan.getPagesOfDocumentation());

    }
}
