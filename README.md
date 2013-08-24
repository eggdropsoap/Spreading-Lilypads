Spreading Lilypads
==================

A Minecraft Forge mod that makes Lily Pads spread in shallow water.

Features
--------

This mod transparently adds growth behaviour to existing lily pads. Lily Pads will now
spread (much like mushrooms do) in shallow water that has natural "soil" beneath.
This makes Lily Pads a renewable resource.
There is *no new worldgen*. This works with existing lilypads in existing worlds.

That's it! There's not much more in the way of features.

Screenshots
-----------



Basics
------

World-generated lilypads in swamps and other biomes will begin to spread when the player
gets near. The spread is slow, but if the player is near for long enough they'll carpet
the swampy shallows, spread out into nearby shallow waters of other biomes, and choke
small ponds. It looks pretty neat.

Breaking lily pads works as normal: you get a placeable Lily Pad block item that you can
transplant elsewhere. If you want it to grow, make sure you've got shallow water and
appropriate soil (dirt, clay, sand, grass). If you don't want it to grow, make sure the
water is either too deep, or the bottom is made of a non-soil block (such as smooth stone,
brick, hardened clay, etc.).

Spreading mechanics
-------------------

Lily Pads will receive plant growth ticks now, just like crops and mushrooms do.
One in 10 ticks will result in a spreading attempt. A lilypad that has five other
lilypads within one block of it will not attempt to spread further. Otherwise, a random
air block above water within one block will be selected and checked for whether it's
a valid spreading location, and this is repeated up to four times before giving up
if no valid spread location is found.

A valid spreading location is determined by the depth of the water and the type of block
below the water. Lilypads will spread to locations above up to two blocks of still water
with a "soil" type block beneath the water. "Soils" include dirt, clay, sand, and grass. 

Requirements
------------

- Minecraft 1.6.2
- Forge

This was developed on Forge 9.10.0.804 (for Minecraft 1.6.2), but any reasonably-recent
Forge version should be compatible.

Compatibility
-------------

Spreading Lilypads makes no base edits to vanilla Minecraft classes, so it should be
compatible with any Forge-compatible mod that doesn't also attempt to alter Lily Pad
blocks.

One block ID is used that defaults to 1700, but which can be changed in the config file.

Installing
----------

1. Install [Forge](http://www.minecraftforge.net/wiki/Installation/Universal)
2. Drop SpreadingLilypads.jar in your mods folder (creating the mods folder if necessary).

Uninstalling
------------

1. Remove SpreadingLilypads.zip from your mods folder.

When you uninstall, all the new lilypads will disappear from your world, leaving only
original world-generated lilypads and hand-placed ones. Neat, eh? So don't worry about
the lilypads taking over your wetlands and ponds; if you end up not liking the effect,
you can safely revert all the changes this mod makes by simply removing it from your
mods folder and loading your world without it.

License and Permissions
-----------------------

Spreading Lilypads is open source, using the 2-clause BSD license (see the LICENSE file
inside the zip file or [LICENSE in the code repo](https://github.com/eggdropsoap/Spreading-Lilypads/blob/master/LICENSE)
for a copy of the license). That means you have the freedom to do
quite a bit with this, including using it in a modpack without needing to ask for my
permission first. (Though if you do, feel free to let me know so I can be all proud.)

The source is available in my
[Spreading Lilypads GitHub repo](https://github.com/eggdropsoap/Spreading-Lilypads)
and may or may not work at any given time,
but you are welcome to take a look at it, fork it, and submit issues there.

Downloads
---------

- [Spreading Lilypads](http://adf.ly/URwvS) ([direct](http://eggdropsoap.pipemaze.com/minecraft/mods/spreading-lilypads/))

Changelog
---------

- 0.1.0: Initial release.