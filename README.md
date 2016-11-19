# leetcode

想必大家都知道leetcode，这里是记录我在leetcode的点点滴滴。

# 开始工作
1.使用IDEA创建了项目，因为leetcode大致是分了algorithms、database和shell三个分类，所以就在IDEA中建了对应的三个模块，截图如下。

<img src="https://github.com/qiaodaimadelaowang/screenshots/raw/master/idea-leetcode.png" width = "300" height = "210" alt="IDEA项目截图" align=center />

既然用的是IDEA，而且我最擅长的也是java，所以算法基本都是用java来写的。

2.把已经存在的本地git项目上传到gitbub上去

这是github的帮助文档
[adding-an-existing-project-to-github-using-the-command-line](https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/)

不过这个过程当中遇到了一个问题，就是当复制的仓库地址是https格式的时候，在命令行添加仓库地址总是报错，即使我把本机的.ssh/目录下的所有ssh key删了。

后来删除leetcode仓库（这里面已经有README.md文件以及lincese文件）之后又新建了空的leetcode仓库（没有创建README.md等任何文件），并且把地址改成了ssh格式之后，就好了。

下面是命令行报错的信息：

tinyhuiwang:leetcode tinyhuiwang$ **git push --set-upstream origin master**

remote: Permission to qiaodaimadelaowang/leetcode.git denied to BlueIceQ.
fatal: unable to access 'https://github.com/qiaodaimadelaowang/leetcode.git/': The requested URL returned error: 403

对，就是这个错误，很郁闷啊，怎么总是提示的是BlueIceQ呢，这个应该是我之前的一个ssh key，并且把这个key上传到了废弃的github账号上了。

tinyhuiwang:leetcode tinyhuiwang$ **git pull**
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> master
