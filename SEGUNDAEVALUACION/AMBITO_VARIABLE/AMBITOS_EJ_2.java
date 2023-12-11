public class AMBITOS_EJ_2 {

    static double km2ComunidadValneciana = 23255;

    static double calculohabitantesPorKm2 (double habitantes,  double km2) {
        return poblacion/km2;
    }

    public static void main (String []args){

        double[] km2 ={10000, 6600};
        double[] habitantes ={2500000, 571000};

        double porcentajekm2 = {(km2[0] / km2ComunidadValneciana) * 100,  (km2[1] / km2ComunidadValneciana)*100};

        double habitantesporkm2 = {calculohabitantesPorKm2(habitantes[0], km2[0]), calculohabitantesPorKm2(habitantes[1], km2[1])};

        System.out.println("Porcentaje de km2 de la provincia de Valencia: " + porcentajeKm2[0] + "%");
        System.out.println("Porcentaje de km2 de la provincia de Castellón: " + porcentajeKm2[1] + "%");
        System.out.println("Habitantes por km2 de la provincia de Valencia: " + habitantesPorKm2[0]);
        System.out.println("Habitantes por km2 de la provincia de Castellón: " + habitantesPorKm2[1]);
    }
}