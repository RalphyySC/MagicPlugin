# TODO

## Add a FAQ on the wiki:

 - How to disable RP delay
 - How to let spells target NPCs

## 6.9.12

 - Fix airglider in offhand
 - Test Blast + Push - had some blocks get stuck in the arena?

 - Wand disappearing during duels- maybe via disarm, maybe drop action? (red 0 on PW)
 - PW would like some custom lore for wand "quiet" and quick cast settings.
 
## 7.0

 - Maybe reconsider config-collapsing approach, switch to routing on get/set ?

 - Move property holder configs to wands (? How to handle /mage configure? Maybe not...)
 
 - Rename WandUpgradePath to Progression path, Deprecate old API classes (can't do this without breaking API changes?)
 - Wand templates will specify properties that come from the Mage versus item data. 
 - Need a default class option?
 - Handle migration for the above.
 - How to handle /wand commands used for Mage properties- just transfer to mage, probably?
 - Implement /mage add, remove
 - Option to filter spells that show on wand by what's available on its current path
 - Might need to add yet another category of spells to paths, those that are allowed but never appear in the spell shop

 - Things to check when it's all ready:
   - What happens if configs fail to load, or classes get messed up? Do we lose data?
   - Should we lose data when a class is intentionally removed? (Hard to tell the difference)

## Heroes

 - Integration with character attribute modifiers. Would be nice to expand Magic's power system to fit this better
 - Heroes skill configs don't seem to work on first run?

## High-Priority

 - Recall warps don't show up with /mage describe?
  
## Not so High-Priority
 
 - Would be cool to have a configurable max # of maps, and start re-using map ids when limit is hit, LRU
 - Ability to alter flower pots and beds (need to tweak TileEntity data.. doable, but messy to track with Material keys)
 - Brush selector on a sub-page for beds says "diamond axe sub-types"?
 - An option on a wand to put all spells at max level (but don't fill)
 - Aliases don't work with levels 
 - Don't refund item costs when a spell goes through auto-undo
 - Ability to specify map dimensions/offset in percentage

## Sabers

 - Paths being able to upgrade blocking/reflect power

## Reported Issues

### Requests

 - Async config load on startup option
 - Add probability table to mob drops
 - Allow multiple welcome_wand entries
 - An attribute that lets spells level up more quickly
 - Add some sort of integration with Partec plugin
   https://www.spigotmc.org/resources/partec-custom-particles-visuals-plugin-api.15386/
 - Wand Power based on Strength potion effect
 - Add ModifyPower action
 - Add Kingdoms support (It's a premium plugin, sooooooo) 
 - Add support for LockettePro
 
 ZQuest API: https://www.spigotmc.org/resources/zquestapi-feel-the-might-of-java.35327/
 ZQuest How to make Extensions: http://zquestwiki.com/index.php?title=APIcreatingExtensions
 ZQuest Page: https://www.spigotmc.org/resources/zquest-feel-the-might-of-creating-1-9-1-10-1-11.18045/
 
## Older stuff

 - MagicArenas: Doesn't TP players out on a draw.. ?
 - Getting hit with aqua erecto says "cast unknown" on you?
 - Admission+Break door = dupe door (thought this was fixed???)
 - Grow/Shrink doesn't work on rabbits?
 - Put a size cap on slimes with Grow
 	
 - Shops/Items:
   - Add new command, mshop
     - /mshop create [shoptype] [title] : Create a new shop NPC, default type "buyshop" in configs
     - /mshop add [worth] <add item in hand to shop, or update worth if present>
     - /mshop remove <remove item in hand from shop>
     - Should look up itemstack (with count of 1) first, save as key if found
     - Eventually a GUI would be nice.
 
 - Alter/grow/shrink/rollback should prevent mobs dropping loot
 
 - Use Entity tags ("Tags" tag, NBTList, see nms.Entity.P()) for tracking magic mobs
 
 - See if snow that falls on something undoable can undo?
 - lingering potions
 
 - Undo bugs with pistons.. yuck. https://youtu.be/S-d-XT2r_vM
 
 - Casting while standing on a gold pressure plate doesn't work :|
 - Arenas preventing last death Recall isn't working?
 - Some kind of gliding-without-Elytra mechanic involving cancelling the glide event?
 - Spell count limit on wands or paths?
 
 - Trying to place a block with a wand in the offhand is super glitchy
 
 - Show mana from offhand wand (if no wand in main hand)
 - Account for offhand items in "armor" checks
 - Add builtin "help" command, check messaging for missing commands- shows "no permission"?
 - Expand armor to include power, other modifiers?
 
 - "Triggered" spells.. ? Apparently MagicSpells does this or somesuch.
   Examples- Activated spells/ passive spells Upon taking damage- activate a heal spell effect Upon dealing damage- explosion in line of sight

 - I think action-specific parameters should not inherit down. Might be a tricky change.
 - Add wand appearance shop

 - Add option to only cast spells when damaging an entity

 - Can still drop your wand by holding while closing your inv
 - Spell organization by path?

 - Pull/Accio on top of an entity sends it skyrocketing
 - Column's radius doesn't seem to work
   
 - CoreProtect integration
   http://minerealm.com/community/viewtopic.php?f=32&t=16362

 - PS TODO:
   - Fix formatting of allowed list, single-column
   - Limit on repeat rentals of a plot

 - Add effects template, for wands to stay one template but act like another (? - for cane)
 - Prevent TNT breaking secured chests

 - There's an area in the RoR where you can cast alohomora and it will spawn doors, in the center of the right side when you enter~
 - Need to fix some door-related undo issues, e.g. casting admission then breaking door sometimes drops door

 - Fix block targeting cast messages

 - Fix that horrible inv-dupe issue :(
 
 - Add spell or brush or something to auto-convert from MagicWorlds configs
 
 - Try to support projectile hitbox modifiers that aren't cubes
 
 - Overrides with commas in them are broken again
 
 - Reducto hay blocks in the PW park, some drop :|

 - Spells acting oddly with Copy - Box, Iterate

 - Don't logout players on server change until they quit

 - Undo action re-work
   - Incorporate UndoBatch into Undo action
     - Make sure to handle special cases, non-cancellable

 - Re-work "active", "deactivate" and "cancel" behaviors?

 - Lead on possible undo issue- undo another player's spell while building, it still builds another tick or so?

 - Spell lore should reflect reduced cooldowns
 - Goggles deactivate on death (maybe only in Azkaban?)
 - Can we save 1 slot in wand inv?
 - Test out silent firework entities
 - Test baby/giant wither bosses:
   You have to set (every tick) the invulnerability of the wither.
   Either you get the data watcher and watch 20 with a value big but below than 1000. I use 600 not to have a too small wither. But there is an easier method which is r() which does it.
   ((CraftWither)wither).getHandle().r(600);
 - Need a way for /cast to be cooldown-free without affecting NPC's, etc.
   - Add list of cast-command params?
   - Would be nice to replace the current toggleCastCommand stuff, but need something special for NPCs.. ?
 - Aliases are broken /wand add doesn't activate, spell items don't work

 - Show countdown in hotbar for duration-based or active-cost spells
 - Add templates to messages.yml for all the various forms a wand and spell
   name can take.

 - Can't hitbox-target entities standing in a corner? Issues with spiders?
 - Look at/expand "item" parameter to SpawnEntity (why do wither skellies start with a bow?)
 - Add "drops" parameter to Damage action to prevent mobs dropping loot.

 - Add /mmap reload command

 - Hover text for spells
 - Cat GIF generator? http://catdb.yawk.at/images?tag=gif
 - Check Regenerate - got stuck, couldn't cancel?
 - Make Portal spell portals avoid creating a frame on the other side (maybe handle TP'ing on portal event?)
 - Logout on death still buggy? (can not reproduce)
 - Wand dupe issue: tl;dr : he was able to drag a wand while in the spell inventory.

 - Clean up MaterialBrush target system, automate somehow?
 - Copy target brush action for tandem replication
 - Automata aren't cleaning up cmd block + redstone
 - Automata don't re-activate un chunk load events (?)
 - Glitching Fill behavior
 - Spell shop improvements:
   - Color spells player can't afford
   - Some sort of ability to set up in-game?
   - Add alphabetize option to base shop (hrm, no, config is a map.. bleh)
   - Allow air as filler blocks
 - Trait improvements
   - Add /parameter command for inspecting single param
 - Nerf Force (shift to break free? Fall protection?)
 - Make map work like replicate, clone - with start point set on activate
   - and maybe not repeat
 - Add repeat option for schematic brushes
   - or generalized option that works with map, too
 - /magic describe should show info about current spell?

## Old Stuff

 - Arena spell/schematic
 - Magic stats (that persist) - block modified, etc. (Statistics API?)
 - Collapse blocklist chains on save (?)
 - Enchant count limit for wands
 - EnderDragon familiars that don't do block damage or spawn a portal on death?

## NEW SPELLS

 - level - levels the ground
 - avatar - Goes into "avatar" state- free spells, super power, levitating, special effects- but rapidly decreasing mana while active.
    - will need a spell-based power/protection system, or use potion effects? 
    - would be nice if this could extend from potioneffect and levitate- maybe refactor?
    - will need a separate "active cost reduction" property
 - banish - sets a player's home and spawn?
 - Fix/finish stairs spell
 - Fix tunnel spell
 - Some kind of "ramp" version of fill, like stairs but with arbitrary blocks?
 - Disguise spells / clone spell
 - Biome modification (mega-frost).
 - Decorate, places paintings at target

## OTHER STUFF
 
 - Customize dynmap map wand pop-ups? Red with black shadows looked cool.. use wand effect color?
 - Make volley multi-sample?
 - Alter names sheep "jeb_", - others "Dinnerbone" ?
 
 - Fix up alter spell, remove id-based lists
 
 - Need separate activate/deactivate costs. Fill vs levitate :\
   - Variable costs would be nice, too- for fill and superconstruct.
 - prevent pillar from passing through non-air blocks of different materials than the target
 - If possible, label more material data like stair direction.
 - Add locale option to suffix messages.yml
 
 - Show active spells in a different color

 - Continue work on combining wands on anvils
 
## TESTING / TWEAKING:
 
 - Test larger undo queue sizes, or count size in blocks?
 - Add console logging of massive construction spell casting

## STACK TRACES / EXTRA DEBUG INFO


## PLAYER REQUESTS:

yoheius
Feb 13, 2014 at 11:51 - 1 like Unlike
Very good Please a Integration with diablodrops Thanks

--- Contacted diablodrops dev, never heard back. Grabbed source code from github, will check it out.

	
