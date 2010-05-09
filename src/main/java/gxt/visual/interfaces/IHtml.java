package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Html;

import gxt.visual.interfaces.presenter.IHtmlPresenter;
import gxt.visual.interfaces.view.IHtmlView;

/**
 * @author eugenp
 */
public interface IHtml extends IBoxComponent, IHtmlView, IHtmlPresenter{
	
	/** mine */
	Html getComponent();

}
