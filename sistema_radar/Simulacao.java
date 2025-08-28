package sistema_radar;

public class Simulacao {
    
public static void main(String[] args) {
    System.out.println("Simulaçao");

    Carro carro1 = new Carro();
    carro1.ano = 76;
    carro1.modelo = "Comodoro";
    carro1.placa = "ACLR300";
    carro1.velocidade = 0;

    Radar radar = new Radar();
    radar.velocidade = 60;
    radar.localizacao = "Pistão Sul";

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
