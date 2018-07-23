open Halite
open Networking
open Bot

let () =
  let state = init_state () in
  send_name (name state);
  let _ = update_state state in
  init state;
  while true do
    let turn_number = update_state state in
    send_commands (turn turn_number);
  done
