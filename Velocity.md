### Velocity Note

1. 指令和变量

   > 指令以`#`开头，变量以`$`开头
   >
   > ```velocity
   > ## this is comments!
   > #* 
   > multi line comments
   > comments tow
   > *#
   > #**
   > @author juniter
   > @date today!
   > *#
   > #set($foo = 'velocity')
   > Hello $foo World!
   > ```

2. 引用、变量、方法

   > - 变量
   >
   >   ```velocity
   >   $juniter ##this is a variable
   >   ##变量可以通过set指令设置，也可以在java代码里有具体的值
   >   #set($foo= 'velocity')
   >
   >   ```
   >
   > - 属性
   >
   >   ```velocity
   >   $jdbc.url
   >   $jdbc.username
   >   ##有多重含义，最终是看其代表的含义决定其值
   >   ```
   >
   > - 方法
   >
   >   ```velocity
   >   $juniter.getAddress()
   >   $juniter.setTitle('this is title')
   >   #set($title = $juniter.getTitle())
   >   ## 比如java.util.List 方法可以使用 String[] myarray
   >   $myarray.isEmpty()
   >   $myarray.set(1,"test")
   >   $myarray.get(1)
   >   $myarray.size()
   >   ##测试一下这个ba
   >   #set($foo.bar[1] = 3)
   >   ```
   >
   > - 引用
   >
   >   ```velocity
   >   ##正式引用,避免一些使用上的歧义
   >   ${juniter.get(1)}
   >   ##轻引用，有时加载文档时文档并没有值，文档加载好了以后才有值,使用！来确保没有脏引用。
   >   <input type="text" name="email" value="$!email" />
   >   $!{email}
   >   ```

3. 指令Directives

   > - `#set
   >
   >   ```velocity
   >   #set( $monkey = $bill ) ## variable reference
   >   #set( $monkey.Friend = "monica" ) ## string literal
   >   #set( $monkey.Blame = $whitehouse.Leak ) ## property reference
   >   #set( $monkey.Plan = $spindoctor.weave($web) ) ## method reference
   >   #set( $monkey.Number = 123 ) ##number literal
   >   #set( $monkey.Say = ["Not", $my, "fault"] ) ## ArrayList
   >   #set( $monkey.Map = {"banana" : "good", "roast beef" : "bad"}) ## Map
   >   ```
   >
   > - foreach
   >
   >   ```velocity
   >   #foreach ($woogie in $boogie)
   >     nothing will happen to $woogie
   >   #end
   >   ```
   >
   > - If elseif else
   >
   >   ```velocity
   >   ## If
   >   #if (true)
   >   	<strong>Velocity</strong>
   >   #end
   >   ## If else
   >   #if (true)
   >   	document.write('ha')
   >   #else
   >   	document.write('hb')
   >   #end
   >   ## elseif
   >   #if($a>1)
   >   	write('>1')
   >   #elseif($a>-1)
   >   	write('1>a>-1')
   >   #else
   >   	write('<1')
   >   	#end
   >   ```
   >
   > - Relational and logical operators
   >
   >   ```velocity
   >   ## logical AND
   >
   >   #if( $foo && $bar )
   >     ** This AND that**
   >   #end
   >
   >   ## AND
   >   #if( $foo || $bar )
   >   	write('or')
   >   ```
   >
   > - Loop Foreach Loop
   >
   >   ```velocity
   >   <ul>
   >   #foreach ( $key in $hashtable.keySet() )  ## hashtalbe key-value
   >   	<li>$hashtable.get($key)</li>
   >   #end
   >   </ul>
   >
   >   ###计数，循环便利的次数
   >   #foreach  ($each in $origin )
   >   	$foreach.count
   >   	#if($foreach.hasNext)
   >   		do something
   >   	#end
   >   #end
   >
   >   $foreach.index 
   >   $foreach.count
   >   $foreach.first
   >   $foreach.last
   >   $foreach.parent.index
   >
   >   ```
   >
   >   ​