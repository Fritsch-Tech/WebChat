<template>
  <v-app>
    <v-toolbar app height="48px">
      <v-toolbar-title class="headline text-uppercase">
        <span>WEB</span>
        <span class="font-weight-light">CHAT</span>
      </v-toolbar-title>
    </v-toolbar>

    <v-content style="height:100%">
        <v-sheet height="100%" color="grey darken-2" dark>
            <v-container grid-list-md fluid fill-height>
                <v-layout row justify-center>
                    <v-flex fill-height xs4 sm4 lg3>
                        <v-sheet height="100%" color="dark" dark>
                            <UserList/>
                        </v-sheet>
                    </v-flex>
                    <v-flex fill-height xs8 sm8 lg6>
                        <v-sheet height="100%" color="dark" dark>
                            <Chat v-if="!loadChat"/>
                            <v-progress-circular
                                v-else
                                indeterminate
                                color="primary">
                            </v-progress-circular>
                        </v-sheet>
                    </v-flex>
                </v-layout>
            </v-container>
        </v-sheet>
    </v-content>
  </v-app>
</template>

<script>
import UserList from './components/UserList'
import Chat     from './components/Chat'

export default {
  name: 'App',
  components: {
    Chat,
    UserList
  },
  data () {
    return {
      //
    }
  },
  computed:{
      loadChannels(){
          return this.$store.state.loadChannels;
      },
      loadChat(){
          return this.$store.state.loadChat;
      }
  },
  created(){
     //this.$store.commit("loadChannels");
  }
}
</script>
