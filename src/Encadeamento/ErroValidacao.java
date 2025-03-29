package Encadeamento;

public class ErroValidacao extends Throwable {

    ErroValidacao ( String msg_erro ) {
        super(msg_erro);
    }
    ErroValidacao ( String msg_erro , Throwable causa) {
        super( msg_erro , causa );
    }
    public void atrbuirCausa ( Throwable causa ) {
        initCause(causa);
    }

    @Override
    public String toString() {
        return "ErroValidacao: "+ this.getMessage();

    }

}
