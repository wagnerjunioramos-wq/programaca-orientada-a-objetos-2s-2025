package sistema_radar;

public class Simulacao {
    
public static void main(String[] args) {
    System.out.println("Simulaçao");
    

    Carro carro1 = new Carro("ACLR300", "Comodoro", 76, 0);
    

    Radar radar = new Radar(60, "Pistão Sul" );
    

    radar.avaliarVelocidade(carro1);

    carro1.acelerar(); // 10
    carro1.acelerar();
    carro1.acelerar();
    carro1.acelerar();
    carro1.acelerar();
    carro1.acelerar();
    carro1.acelerar(); // 70
    radar.avaliarVelocidade(carro1);

    carro1.frear();
    
    radar.avaliarVelocidade(carro1);
}
}
