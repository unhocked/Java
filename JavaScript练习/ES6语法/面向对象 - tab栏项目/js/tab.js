var that;
class Tab {
    constructor(id){
        //获取元素
        that = this
        this.main = document.querySelector(id)
        this.lis = this.main.querySelectorAll('li')
        this.section = this.main.querySelectorAll('section')
        this.add = this.main.querySelector('.tabadd')
        this.ul = this.main.querySelector('.first-nav ul:first-child')
        this.secti = this.main.querySelector('.tabscon')
        this.remove = this.main.querySelectorAll('.icon-close')
        this.init()
    }
    init(){
        this.updateNode()
        // init初始化操作,让相关的元素绑定时间
        this.add.onclick = this.addTab
        for(let i = 0; i < this.lis.length;i++){
            this.lis[i].index = i;
            this.lis[i].onclick = this.toggleTab;
            this.remove[i].onclick = this.removeTab;
            this.spans[i].ondblclick = this.idetTab
            this.section[i].ondblclick = this.idetTab
        }
    }
    //获取所有li和section
    updateNode(){
        this.lis = this.main.querySelectorAll('li')
        this.section = this.main.querySelectorAll('section')
        this.remove = this.main.querySelectorAll('.icon-close')
        this.spans = this.main.querySelectorAll('.first-nav li span:first-child')
    }
    //切换
    toggleTab(){
        that.clearclass()
        this.className = 'active'
        that.section[this.index].className = 'conactive'
    }
    //清除类
    clearclass(){
        for(var i = 0;i<this.lis.length;i++){
            this.lis[i].className = ''
            this.section[i].className =''
        }
    }
    //添加
    addTab(){
        that.clearclass()
        //1`创建li元素和section内容去
        var number = Math.random()*10;
        var li = '<li class="active"><span>新增 '+ number +'</span><span class="icon-close">X</span></li>'
        var sect = '<section class="conactive">新增 '+ number +'</section>'

        //2`把两个元素追加到对应的父元素里面
        that.ul.insertAdjacentHTML('beforeend',li)
        that.secti.insertAdjacentHTML('beforeend',sect)
        that.init()
    }
    //删除
    removeTab(e){
        e.stopPropagation()
        var index = this.parentNode.index
        // console.log(index);
        //remove方法可以直接删除指定的元素
        that.lis[index].remove();
        that.section[index].remove();
        that.init()
        if( document.querySelector('.first-nav li.active')) return
        //当我们删除了当前li的时候,前一个li处于选定状态
        index--
        //判断index下标不为-1,才执行后面默认点击事件
        that.lis[index] && that.lis[index].click()
    }
    //修改
    idetTab(){
        let str = this.innerHTML

        //双击禁止选中文字
        window.getSelection ? window.getSelection().removeAllRanges() : document.selection.empty()
        this.innerHTML = `<input type="text"/>`
        let input = this.children[0]
        input.value = str
        input.select()//让文本处于选中状态

        //当离开焦点是将文本框内的值给到原来的元素
        input.onblur = function(){
            this.parentNode.innerHTML = this.value
        }
        //按下回车也可以将文本框内的值给到原来的元素
        input.onkeyup = function(e){
            if(e.keyCode === 13){
                this.blur()
            }
        }
    }
}
new Tab('#tab')
