    
import java_cup.runtime.Symbol;
    
%%

%class Lexer
%implements symbols 
%unicode
%cup
%line
%column

%{
	
    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}
Comment = "<!--" [^*] ~"-->" 
   
%%

    <YYINITIAL> {

      /* Tags */
      ">"                         { return symbolFactory.newSymbol("endTag", endTag); }
      "<body"                     { return symbolFactory.newSymbol("bodyOpen", bodyOpen); }
      "</body"			              { return symbolFactory.newSymbol("bodyClose",bodyClose); }
      "<frame"			              { return symbolFactory.newSymbol("frame",frame); }
      "<frameset"		              { return symbolFactory.newSymbol("framesetOpen",framesetOpen); }
      "</frameset"		            { return symbolFactory.newSymbol("framesetClose", framesetClose); }
      "<noframes"		              { return symbolFactory.newSymbol("noframesOpen",noframesOpen); }
      "</noframes"		            { return symbolFactory.newSymbol("noframesClose",noframesClose); }
      "<form"			                { return symbolFactory.newSymbol("formOpen", formOpen); }
      "</form"			              { return symbolFactory.newSymbol("formClose", formClose); }
      "<input"			              { return symbolFactory.newSymbol("input", input); }
      "<select"			              { return symbolFactory.newSymbol("selectOpen", selectOpen); }
      "</select"		              { return symbolFactory.newSymbol("selectClose", selectClose); }
      "<option"			              { return symbolFactory.newSymbol("optionOpen",optionOpen); }
      "</option"		              { return symbolFactory.newSymbol("optionClose", optionClose); }
      "<table"		  	            { return symbolFactory.newSymbol("tableOpen", tableOpen); }
      "</table"			              { return symbolFactory.newSymbol("tableClose", tableClose); }
      "<tr"			                  { return symbolFactory.newSymbol("trOpen", trOpen); }
      "</tr"			                { return symbolFactory.newSymbol("trClose",trClose); }
      "<td"			                  { return symbolFactory.newSymbol("tdOpen", tdOpen); }
      "</td"			                { return symbolFactory.newSymbol("tdClose", tdClose); }
      "<th"			                  { return symbolFactory.newSymbol("thOpen", thOpen); }
      "</th"			                { return symbolFactory.newSymbol("thClose", thClose); }
      "<thead"			              { return symbolFactory.newSymbol("thread", thread); }
      "<tbody"			              { return symbolFactory.newSymbol("tbody",tbody); }
      "<img"			                { return symbolFactory.newSymbol("img", img); }
      "<a"			                  { return symbolFactory.newSymbol("aOpen", aOpen); }
      "</a"			                  { return symbolFactory.newSymbol("aClose", aClose); }
      "<ul"			                  { return symbolFactory.newSymbol("ulOpen", ulOpen); }
      "</ul"			                { return symbolFactory.newSymbol("ulClose", ulClose); }
      "<li"			                  { return symbolFactory.newSymbol("liOpen",liOpen); }
      "</li"			                { return symbolFactory.newSymbol("liClose", liClose); }
      "<ol"			                  { return symbolFactory.newSymbol("olOpen",olOpen); }
      "</ol"			                { return symbolFactory.newSymbol("olClose",olClose); }
      "<p"			                  { return symbolFactory.newSymbol("pOpen", pOpen); }
      "</p>"			                { return symbolFactory.newSymbol("pClose",pClose); }
      "<i"			                  { return symbolFactory.newSymbol("iOpen", iOpen); }
      "</i"			                  { return symbolFactory.newSymbol("iClose", iClose); }
      "<u"			                  { return symbolFactory.newSymbol("uOpen", uOpen); }
      "</u"			                  { return symbolFactory.newSymbol("uClose",uClose); }
      "<small"			              { return symbolFactory.newSymbol("smallOpen", smallOpen); }
      "</small"			              { return symbolFactory.newSymbol("smallClose",smallClose); }
      "<sup"			                { return symbolFactory.newSymbol("supOpen", supOpen); }
      "</sup"			                { return symbolFactory.newSymbol("supClose", supClose); }
      "<sub"			                { return symbolFactory.newSymbol("subOpen", subOpen); }
      "</sub"			                { return symbolFactory.newSymbol("subClose",subClose); }
      "center"			              { return symbolFactory.newSymbol("center",center); }
      "<font"			                { return symbolFactory.newSymbol("fontOpen", fontOpen); }
      "</font"			              { return symbolFactory.newSymbol("fontClose", fontClose); }
      "<h1"			                  { return symbolFactory.newSymbol("h1Open", h1Open); }
      "</h1"			                { return symbolFactory.newSymbol("h1Close", h1Close); }
      "<h2"			                  { return symbolFactory.newSymbol("h2Open", h2Open); }
      "</h2"			                { return symbolFactory.newSymbol("h2Close", h2Close); }
      "<h3"			                  { return symbolFactory.newSymbol("h3Open", h3Open); }
      "</h3"			                { return symbolFactory.newSymbol("h3Close", h3Close); }
      "<h4"			                  { return symbolFactory.newSymbol("h4Open",h4Open); }
      "</h4"			                { return symbolFactory.newSymbol("h4Close", h4Close); }
      "<h5"			                  { return symbolFactory.newSymbol("h5Open",h5Open); }
      "</h5"			                { return symbolFactory.newSymbol("h5Close",h5Close); }
      "<h6"			                  { return symbolFactory.newSymbol("h6Open", h6Open); }
      "</h6"			                { return symbolFactory.newSymbol("h6Close", h6Close); }
      "<hr"			                  { return symbolFactory.newSymbol("hr", hr); }
      "<br"			                  { return symbolFactory.newSymbol("br", br); }

      /* Global Attributes */
      
      "class"			                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "dir"			                  { return symbolFactory.newSymbol("accesskey", accesskey); }
      "id"			                  { return symbolFactory.newSymbol("accesskey", accesskey); }
      "lang"			                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onclick"			              { return symbolFactory.newSymbol("accesskey", accesskey); }
      "ondblclick"                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onkeydown"                 { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onkeypress"                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onkeyup"                   { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onmousedown"               { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onmousemove"               { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onmouseout"                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onmouseover"               { return symbolFactory.newSymbol("accesskey", accesskey); }
      "onmouseup"                 { return symbolFactory.newSymbol("accesskey", accesskey); }
      "contenteditable"			      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "contextmenu"			          { return symbolFactory.newSymbol("accesskey", accesskey); }
      "data"			                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "draggable"			            { return symbolFactory.newSymbol("accesskey", accesskey); }
      "dropzone"	                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "hidden"	                  { return symbolFactory.newSymbol("accesskey", accesskey); }
      "spellcheck"			          { return symbolFactory.newSymbol("accesskey", accesskey); }
      "style"			                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "tabindex"			            { return symbolFactory.newSymbol("accesskey", accesskey); }
      "title"			                { return symbolFactory.newSymbol("accesskey", accesskey); }

      /* Attributes */

      "accesskey", accesskey                 { return symbolFactory.newSymbol("accesskey", accesskey); }
      "charset"                   { return symbolFactory.newSymbol("accesskey", accesskey); }
      "charset"                   { return symbolFactory.newSymbol("accesskey", accesskey); }
      "href"                      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "hreflang"                  { return symbolFactory.newSymbol("accesskey", accesskey); }
      "name"                      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "rel"                       { return symbolFactory.newSymbol("accesskey", accesskey); }
      "rev"                       { return symbolFactory.newSymbol("accesskey", accesskey); }
      "shape"                     { return symbolFactory.newSymbol("accesskey", accesskey); }
      "tabindex"                  { return symbolFactory.newSymbol("accesskey", accesskey); }
      "target"                    { return symbolFactory.newSymbol("accesskey", accesskey); }
      "type"                      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "align"                     { return symbolFactory.newSymbol("accesskey", accesskey); }
      "alt"                       { return symbolFactory.newSymbol("accesskey", accesskey); }
      "archive"                   { return symbolFactory.newSymbol("accesskey", accesskey); }
      "code"                      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "codebase"                  { return symbolFactory.newSymbol("accesskey", accesskey); }
      "height"                    { return symbolFactory.newSymbol("accesskey", accesskey); }
      "hspace"                    { return symbolFactory.newSymbol("accesskey", accesskey); }
      "mayscript"                 { return symbolFactory.newSymbol("accesskey", accesskey); }
      "name"                      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "vspace"                    { return symbolFactory.newSymbol("accesskey", accesskey); }
      "width"                     { return symbolFactory.newSymbol("accesskey", accesskey); }
      "loop"                      { return symbolFactory.newSymbol("accesskey", accesskey); }
      "background"                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "bgcolor"                   { return symbolFactory.newSymbol("accesskey", accesskey); }
      "bgproperties"              { return symbolFactory.newSymbol("accesskey", accesskey); }
      "leftmargin"                { return symbolFactory.newSymbol("accesskey", accesskey); }
      "clear"                     { return symbolFactory.newSymbol("accesskey", accesskey); }
    }
    
    
