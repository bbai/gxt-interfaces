package gxt.visual.extensions.client;

import com.extjs.gxt.ui.client.data.PagingLoader;

/**
 * This interface represents a common contract for all paging toolbars in the system (and perhaps in GXT as well) <br>
 * @author eugenp <br>
 */
public interface IBindedPagingToolbar{
	
	void bind( final PagingLoader< ? > loaderToSet );
	
}
