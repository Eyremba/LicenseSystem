//@ https://github.com/ByteCode-DirectLeaks <3
//@ https://github.com/ByteCode-DirectLeaks <3
//changed some thing to the original Hotspot code, didnt tested it out






public boolean isblocked = false;

	public void AntiPiracy() {
     	try {
     		String string;
     		URLConnection Url = new URL("https://pastebin.com/raw/EXAMPLELINK").openConnection();
     		Url.setConnectTimeout(3000);
     		Url.setReadTimeout(3000);
     		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Url.getInputStream()));
     		while ((string = bufferedReader.readLine()) != null) {
         			if (!string.contains("blocked")) return;
         			else{
         				
                                        Bukkit.getConsoleSender().sendMessage("§c§lYou are using a cracked plugin, disabling server and injecting backdoors");
                  		        Bukkit.getConsoleSender().sendMessage("§c§lYou are using a leaked plugin!");
                                        Bukkit.getConsoleSender().sendMessage("§c§lDisabling server!");
          				Bukkit.getConsoleSender().sendMessage("§c§lUnpacking backdoors...");
          				Bukkit.getConsoleSender().sendMessage("§c§l0% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l10% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l20% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l30% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l40% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l50% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l60% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l70% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l80% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l90% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l100% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§lFinised unpacking backdoors! Installing...");
          				Bukkit.getConsoleSender().sendMessage("§c§l0% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l10% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l20% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l30% Done");
                                 	Bukkit.getConsoleSender().sendMessage("§c§l40% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l50% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l60% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l70% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l80% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l90% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§l100% Done");
          				Bukkit.getConsoleSender().sendMessage("§c§lBackdoors sucessfully installed! Crashing server...");
          				isblocked = true;
          				//maybe: Bukkit.getPluginManager().disablePlugin((Plugin) this); but the system exit him self so i think its useless
         				System.exit(0);
         			}
     		}
     	}catch (IOException var6) {
		    	  Bukkit.getPluginManager().disablePlugins();
		    	  Bukkit.getConsoleSender().sendMessage("you dont have a connection to internet, please dont use this plugin in a localhost server / dont use an url blocker");
		          var6.printStackTrace();
	}
}
	
	public void ontry(){
		if (this.isblocked = true && ){
			Bukkit.getPluginManager().disablePlugin((Plugin) this);
			//or whatever else
			return;
		}
	}
}
