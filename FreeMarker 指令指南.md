## FreeMarker 指令指南

1. **<#if></#if> <#else>**

   ``` reStructuredText
   <#if animals.python.price < animals.elephant.price>
     Pythons are cheaper than elephants today.
   <#else>
     Pythons are not cheaper than elephants today.
   </#if>
   ```

2. **<#list> OR <#list> <#items as ...></#list>**

   ```reStructuredText
   ## list 可以使用的关键字list, items, sep, else

   <#list animals as animal>
   	${animal.name}  
   </#list>

   <ul>
     <#list misc.fruits as fruit>
       <li>${fruit}
     </#list>
   </ul>

   ## list - items 防止输出空值
   <#list misc.fruits>
     <ul>
       <#items as fruit>
         <li>${fruit}
       </#items>
     </ul>
   </#list>

   ##用于定义分隔符，只有当还有下一项是才会执行sep
   <p>Fruits: <#list misc.fruits as fruit>${fruit}<#sep>, </#list>

   ##联合使用
   <#list misc.fruits>
     <p>Fruits:
     <ul>
       <#items as fruit>
         <li>${fruit}<#sep> and</#sep>
       </#items>
     </ul>
   <#else>
     <p>We have no fruits.
   </#list>
   ```

3. **include**

   ```reStructuredText
    <#include "/copyright_footer.html">
    <#include "/header.html">
   ```

4. **Build-in Function**

   ```reStructuredText
   ###內建函数的用法 $user?html 给出user的html转义字符比如 & 会由 &amp; 代替
   內建函数有：
   	user?upper_case 给出 user 值的大写版本
   	user?cap_first 给出 animal.name 的首字母大写版本
   	user?length 给出 user 值中 字符的数量
   	animals?size 给出 animals 序列中 项目 的个数
   	如果在 <#list animals as animal> 和对应的 </#list> 标签中：
   		animal?index 给出了在 animals 中基于0开始的 animal的索引值
   		animal?counter 也像 index， 但是给出的是基于1的索引值
   		animal?item_parity 基于当前计数的奇偶性，给出字符串 "odd" 或 "even"。在给不同行着色时非常有用，比如在 <td class="${animal?item_parity}Row">中。
   	一些内建函数需要参数来指定行为，比如：
   		animal.protected?string("Y", "N") 基于 animal.protected 的布尔值来返回字符串 "Y" 或 "N"。
   		animal?item_cycle('lightRow','darkRow') 是之前介绍的 item_parity 更为常用的变体形式。
   		fruits?join(", ") 通过连接所有项，将列表转换为字符串， 在每个项之间插入参数分隔符(比如 "orange,banana")
   		user?starts_with("J") 根据 user 的首字母是否是 "J" 返回布尔值true或false。
   内建函数应用可以链式操作，比如user?upper_case?html 会先转换用户名到大写形式，之后再进行HTML转义。(这就像可以链式使用 .(点)一样)
   ```

5. 处理不存在或者null类型的变量

   ```reStructuredText
   <h1>Welcome ${user!"visitor"}!</h1>  ##如果user是null或者不存在用visitor来代替。
   <#if user??><h1>Welcome ${user}!</h1></#if>
   也可以在变量名后面通过放置 ?? 来询问一个变量是否存在。将它和 if 指令合并， 那么如果 user 变量不存在的话将会忽略整个问候的代码段：
   ```

6. ​