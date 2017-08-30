import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of the abstract factory.
 * see: https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 */
class Good {
  interface FabricaDeCarro {
    CarroSedan criarCarroSedan();
    CarroPopular criarCarroPopular();
  }
  class FabricaFiat implements FabricaDeCarro {
 
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }
 
    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
  }
  
  interface CarroPopular {
    void exibirInfoPopular();
  }
  interface CarroSedan {
    void exibirInfoSedan();
  }
  
  class FabricaFord implements FabricaDeCarro {
	  
	    @Override
	    public CarroSedan criarCarroSedan() {
	        return new FiestaSedan();
	    }
	 
	    @Override
	    public CarroPopular criarCarroPopular() {
	        return new NovoUno();
	    }
	  }
	  
	  interface CarroPopularFord {
	    void exibirInfoPopular();
	  }
	  interface CarroSedanFord {
	    void exibirInfoSedan();
	  }
  
	  
	  class FiestaSedan implements CarroSedan {
		  
		    @Override
		    public void exibirInfoSedan() {
		        System.out.println("Modelo: Fiesta Sedan\nFábrica: Ford\nCategoria:Sedan");
		    }
	  }
	  class NovoUno implements CarroPopular {
				  
			@Override
		    public void exibirInfoPopular() {
		        System.out.println("Modelo: Ka\nFábrica: Ford\nCategoria:Popular");
			}
	  }
		    
  class Palio implements CarroPopular {
 
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
    }
  }
  class Siena implements CarroSedan {
 
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
    }
  }
  
  public static void main(String[] args) {
	Good g = new Good();
    FabricaDeCarro fabrica = g.new FabricaFiat();
    CarroSedan sedan = fabrica.criarCarroSedan();
    CarroPopular popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
    System.out.println();
 
    FabricaDeCarro fabrica2 = g.new FabricaFord();
    CarroSedan sedanford = fabrica2.criarCarroSedan();
    CarroPopular popularford = fabrica2.criarCarroPopular();
    sedanford.exibirInfoSedan();
    System.out.println();
    popularford.exibirInfoPopular();
    
  }
}