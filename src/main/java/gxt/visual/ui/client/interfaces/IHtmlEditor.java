package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IHtmlEditorPresenter;
import gxt.visual.ui.client.interfaces.view.IHtmlEditorView;

import com.extjs.gxt.ui.client.widget.form.HtmlEditor;

/**
 * @author ADaroussin
 */
public interface IHtmlEditor extends IField< String >, IHtmlEditorView, IHtmlEditorPresenter{

	/** mine */
	HtmlEditor getComponent();

}
