###Git 简用
---
#### 配系统环境变量

#### 配置身份

git config --global user.name  your.name

git config --global user.email  your.email

### 常用命令


git init  //创建仓库

git add .   //添加文件/目录

git commit -m "First commit"  //提交至本地仓库

git status  //查看文件修改情况

git diff   ……/test.java   //查看更改内容 

git checkout  ……/test.java  //撤销更改 （未add）

git reset HEAD ……/test.java  //更改为未添加状态  + 下一步可撤销 checkout

git log   //查看提交记录

git log  $id$   -1 -p  //1表示只看一条；减号表示只看删除部分;加号表示只看添加部分

>分支branch

git branch   //查看当前分支

git branch alpha  //新建分支

git checkout alpha  //切换至alpha分支

git checkout master 

git merge alpha  //切换回主分支，合并alpha分支

git branch -d alpha  //删除alpha分支

git push origin alpha  //推送至远程仓库github分支alpha，没有则新建

git push origin :alpha //删除远程仓库github分支alpha

>标签tag  给开发分支alpha做一个标记

git tag -a Feature_1 -m "add feature_1"  // -a是添加标签 Feature_1是标签名  -m是添加标签注释

git tag -d Feature_1  //删除指定标签

git push origin -tags  //提交本地标签至远程仓库

git push origin :refs/tags/Feature_1  //删除远程仓库标签

git tag  //查看标签 或是 tag -1



