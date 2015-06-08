# Introduction #

DirBuildPathUpdater is modifier plugin for java projects classpath.


# How to Use #

## Add libraries to build path. ##
  * Select Folder in some view, and show context menu.
> Select **Dir Build path Updater > Add libraries under this Dir to Build Path**.
> > ![http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/add.png](http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/add.png)
  * Then classpath is updated.
> > ![http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/added.png](http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/added.png)
  * This update is diffrent from **Build Path > Add to Build Path**
    * .jar and .zip files other than contain -sources and -src files.
    * added libraries are attach source archives.
> > DirBuildPathUpdater find source archive automatically.
> > > ![http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/addedbuildpath.png](http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/addedbuildpath.png)
    * added libraries are export from project.
> > > ![http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/added_export.png](http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/added_export.png)
  * Do it once, DirBuildPathUpdater keep watch the dir.

> anyone modify that dir contents then update build path automatically.

## Remove libraries from build path. ##
  * Select **Dir Build path Updater > Remove libraries under this Dir from Build Path**.
> > ![http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/remove.png](http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/remove.png)
  * Then classpath is updated.
> > ![http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/removed.png](http://werkzeugkasten.googlecode.com/svn/wiki/DirBuildPathUpdater/removed.png)
  * added libraries are remove from build path and stop watching that dir.