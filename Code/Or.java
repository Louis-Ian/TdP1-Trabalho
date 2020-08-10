package tecnicas;

public class Or implements IOperation{

	@Override
	public Boolean operation(Boolean v1, Boolean v2) {
		boolean retorno = v1 || v2;
		return retorno;
	}

}
