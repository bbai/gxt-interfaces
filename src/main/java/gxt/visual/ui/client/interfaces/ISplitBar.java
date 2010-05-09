package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.SplitBar;

import gxt.visual.ui.client.interfaces.presenter.ISplitBarPresenter;
import gxt.visual.ui.client.interfaces.view.ISplitBarView;

/**
 * @author eugenp
 */
public interface ISplitBar extends IBoxComponent, ISplitBarView, ISplitBarPresenter{
	
	/** mine */
	SplitBar getComponent();

}
