package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.ProgressBar;

import gxt.visual.ui.client.interfaces.presenter.IProgressBarPresenter;
import gxt.visual.ui.client.interfaces.view.IProgressBarView;

/**
 * @author eugenp
 */
public interface IProgressBar extends IBoxComponent, IProgressBarView, IProgressBarPresenter{
	
	/** mine */
	ProgressBar getComponent();

}
