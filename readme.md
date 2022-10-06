执行west update获取2个依赖仓库dependencies/downloads和dependencies/00_git2Merge

(1/5)下载linux-5.16.tar.xz和qemu-6.2.0.tar.xz到上层目录内，即dependencies/downloads/archives内部
(2/5)执行clone2Git.sh克隆38个目录仓库。
(3/5)按照clone2Git.sh的提示手动克隆体积接近3G的内核仓库，即git://git.yoctoproject.org/linux-yocto.git的v5.15/standard/base分支，位于dependencies/git2/git.yoctoproject.org.linux-yocto.git，且切换到新分支machine

(4/5)进入到poky目录执行oe-init-build-env，默认生成名为build的"构建路径"文件夹，进入build后，将../bitbake/bin加入PATH环境变量。
(5/5)执行cp -r ../../00_downloads downloads命令，将git根路径内的00_downloads复制改名为构建路径下的downloads文件夹，即build/downloads

执行bitbake --runall fetch core-image-minimal验证依赖是否齐全
执行bitbake core-image-minimal构建BSP
