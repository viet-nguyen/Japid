package japidviews._layouts;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static cn.bran.play.WebUtils.*;
// NOTE: This file was generated from: japidviews/_layouts/SampleLayout.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public abstract class SampleLayout extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_layouts/SampleLayout.html";
	public SampleLayout() {
		super(null);
	}
	public SampleLayout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		play.mvc.Http.Request request = play.mvc.Http.Request.current(); assert request != null;
		play.mvc.Http.Response response = play.mvc.Http.Response.current(); assert response != null;
		play.mvc.Scope.Flash flash = play.mvc.Scope.Flash.current();assert flash != null;
		play.mvc.Scope.Session session = play.mvc.Scope.Session.current();assert session != null;
		play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current(); assert renderArgs != null;
		play.mvc.Scope.Params params = play.mvc.Scope.Params.current();assert params != null;
		play.data.validation.Validation validation = play.data.validation.Validation.current();assert validation!= null;
		cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);assert errors != null;
		play.Play _play = new play.Play(); assert _play != null;
		p("A sample layout.\n" + 
"<p>\n");// line 1
	title();// line 3
p(";\n" + 
"</p>\n" + 
"<div>\n");// line 3
	doLayout();// line 6
p("</div>\n");// line 6
	}	protected abstract void title();
	protected abstract void doLayout();
}