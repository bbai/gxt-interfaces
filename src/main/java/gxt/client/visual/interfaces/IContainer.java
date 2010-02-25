package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IContainer< T extends Component > extends IBoxComponent{
	
	El getLayoutTarget();
	
	boolean removeAll();

}
