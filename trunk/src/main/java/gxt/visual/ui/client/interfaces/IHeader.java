package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Header;
import com.extjs.gxt.ui.client.widget.IconSupport;

import gxt.visual.ui.client.interfaces.presenter.IHeaderPresenter;
import gxt.visual.ui.client.interfaces.view.IHeaderView;

/**
 * @author eugenp
 */
public interface IHeader extends IComponent, IHeaderView, IHeaderPresenter, IconSupport{
	
	/** mine */
	Header getComponent();

}
