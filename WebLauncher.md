# Introduction #

WebLauncher is Launching Plugin for Web Container.

WebLauncher includes some of Web Container, so you needless to download servers.
  * [Apache Tomcat](http://tomcat.apache.org)(6.0.x , 5.5.x) is most popular Web Container.
  * [Jetty6](http://www.mortbay.org/) is fuctional and alternative Web Container.
  * [SDLoader](http://code.google.com/p/sdloader/) is simple Web Container.

# Getting Started #

  * In the Package Explorer, Select project.
  * Select Properties from the project's context menu.
  * Select WebLauncher in the project properties page.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/propertypage.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/propertypage.png)
  * Check Use WebLauncher
  * Click OK
  * You can start Web Server by three way.
    * Select WebLauncher > Start Web Server from the project's context menu.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/start_contextmenu.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/start_contextmenu.png)
    * Select WebLauncher > Start Web Server in the menu bar.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/start_menubar.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/start_menubar.png)
    * Click the Start Web Server button in the toolbar.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/start_toolbar.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/start_toolbar.png)
  * If Weblauncher start Web Server successfully, project's icon and label is decorated.

> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/running.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/running.png)
  * You can stop Web Server by same way to start.
    * Select WebLauncher > Stop Web Server from the project's context menu.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/stop_contextmenu.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/stop_contextmenu.png)
    * Select WebLauncher > Stop Web Server in the menu bar.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/stop_menubar.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/stop_menubar.png)
    * Click the Stop Web Server button in the toolbar.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/stop_toolbar.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/stop_toolbar.png)

# View Contents On Web Server #

  * Select Web contents under webapplication base directory.
  * Select **WebLauncher -> View on Server** on context menu.

> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/viewonserver.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/viewonserver.png)
  * Web Launcher Opens that contents on the Sever context.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/viewcontents.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/viewcontents.png)

# Export Web Archive #
  * Select WebLauncher enabled Project.
  * Select **WebLauncher -> Export War** on context menu.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_war.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_war.png)
  * WebLauncher export that project.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/generated.war.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/generated.war.png)
  * if you want to exclude any resources,Select Properties from the project's context menu.
> > Select WebLauncher in the project properties page.
> > > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_pref.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_pref.png)

> > You may edit **War exclude pattern**. pattern is the **regular expression**.
> > Some of matched directories and files are excluded from war.

# Export Executable Web Archive #
  * Select [SDLoader](http://code.google.com/p/sdloader/) in the project properties page.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_war_sdloader_pref.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_war_sdloader_pref.png)
  * Select **WebLauncher -> Export ExecutableWar** on context menu.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_war_sdloader.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/export_war_sdloader.png)
  * WebLauncher export that project.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/generated.war.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/generated.war.png)
  * This war file contain [SDLoader](http://code.google.com/p/sdloader/) and some tricks.
  * You may execute this war ,for example
```
java -jar webproject.war
```
  * Then boot [SDLoader](http://code.google.com/p/sdloader/) and deploy that war.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/execute.war.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/execute.war.png)
  * And then system default browser execute and access to started server.
> > ![http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/popuped.webapp.png](http://werkzeugkasten.googlecode.com/svn/trunk/werkzeugkasten.docs/html/images/weblauncher/popuped.webapp.png)
