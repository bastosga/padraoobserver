import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTeste {
    @Test
    void returnNotify() {
        Concessionaria concessionaria = new Concessionaria(1, "Vassouras", "Tamiozzo Carros");
        Carro carroA = new Carro("Gol g5");
        Carro carroB = new Carro("Virtus");
        carroA.cadastrar(concessionaria);
        carroB.cadastrar(concessionaria);
        concessionaria.cadastrarCarro();
        assertEquals("Gol g5, carro cadastrado na Concessionaria{unidade=1, cidade='Vassouras', concessionaria='Tamiozzo Carros'}", carroA.getNotify());
        assertEquals("Virtus, carro cadastrado na Concessionaria{unidade=1, cidade='Vassouras', concessionaria='Tamiozzo Carros'}", carroB.getNotify());
    }
    @Test
    void notReturnNotify() {
        Concessionaria concessionaria = new Concessionaria(2, "Paraiba do Sul", "ABC Carros");
        Carro carro = new Carro("Focus");
        concessionaria.cadastrarCarro();
        assertEquals(null, carro.getNotify());
    }
}